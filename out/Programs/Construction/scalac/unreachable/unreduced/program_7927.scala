package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: D, b: T_B[D, D]) extends T_A[D]
case class CC_B(a: ((Char,Int),(Byte,Char))) extends T_A[T_B[Int, CC_A[Boolean]]]
case class CC_C(a: T_A[T_A[CC_B]]) extends T_A[T_B[Int, CC_A[Boolean]]]
case class CC_D[E](a: T_B[E, CC_C], b: T_A[E], c: CC_C) extends T_B[E, CC_C]
case class CC_E[F](a: (CC_B,CC_D[CC_B]), b: CC_B) extends T_B[CC_B, F]
case class CC_F(a: T_B[(CC_B,CC_B), CC_C], b: CC_C, c: T_B[CC_B, Byte]) extends T_B[CC_B, Byte]

val v_a: T_A[T_B[Int, CC_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(((_,_),(_,_))) => 1 
  case CC_C(CC_A(_, _)) => 2 
}
}