package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: (T_A[Char, Int],(Boolean,Char))) extends T_A[E, F]
case class CC_B[H, G](a: H) extends T_A[H, G]
case class CC_C(a: Int) extends T_B[Boolean, CC_A[CC_B[Int, Boolean], (Int,Int)]]
case class CC_D[I](a: T_B[T_A[CC_C, CC_C], I], b: I) extends T_B[Boolean, CC_A[CC_B[Int, Boolean], (Int,Int)]]

val v_a: T_B[Boolean, CC_A[CC_B[Int, Boolean], (Int,Int)]] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D(_, _) => 1 
}
}