package harish.hibare.retriveimage;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;



public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {


    private Context mCtx;
    private List<Product> productList;

    public ProductAdapter(Context mCtx, List<Product> productList) {
        this.mCtx = mCtx;
        this.productList = productList;
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.product_list, null);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {
        Product product = productList.get(position);

        //loading the image
        Glide.with(mCtx)
                .load(product.getImage())
                .into(holder.imgProductImage);

        holder.txtProductName.setText(product.getTitle());

        holder.txtProductPrice.setText(String.valueOf(product.getPrice()));
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    class ProductViewHolder extends RecyclerView.ViewHolder {

        TextView txtProductName,  txtProductPrice;
        ImageView imgProductImage,imgShare,imgCart,imgFavourite;

        public ProductViewHolder(View itemView) {
            super(itemView);

            txtProductName = itemView.findViewById(R.id.txtProductName);

            txtProductPrice = itemView.findViewById(R.id.txtProductPrice);
            imgProductImage = itemView.findViewById(R.id.imgProductImage);
            imgShare = itemView.findViewById(R.id.imgShare);
            imgCart = itemView.findViewById(R.id.imgCart);
            imgFavourite = itemView.findViewById(R.id.imgFavourite);
        }
    }
}