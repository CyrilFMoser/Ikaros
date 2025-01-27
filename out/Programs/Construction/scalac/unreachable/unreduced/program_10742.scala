package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[(Char,Char)], b: Char) extends T_A[T_B[T_B[Boolean]]]
case class CC_B() extends T_A[T_B[T_B[Boolean]]]
case class CC_C[C](a: T_A[C], b: T_B[C], c: Int) extends T_B[C]
case class CC_D[D]() extends T_B[D]
case class CC_E(a: T_B[CC_D[(Char,Int)]], b: Boolean) extends T_B[CC_C[CC_B]]

val v_a: T_B[T_B[CC_C[CC_B]]] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_C(_, _, _), _) => 0 
  case CC_C(_, CC_D(), _) => 1 
  case CC_D() => 2 
}
}