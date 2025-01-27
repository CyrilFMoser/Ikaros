package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[(Boolean,Byte)]) extends T_A[T_B[T_A[Int], T_A[Boolean]]]
case class CC_B() extends T_A[T_B[T_A[Int], T_A[Boolean]]]
case class CC_C(a: (CC_A,Int), b: (Byte,CC_B), c: T_A[T_B[CC_B, CC_B]]) extends T_B[Boolean, CC_A]
case class CC_D[D](a: T_A[D], b: CC_A) extends T_B[Boolean, CC_A]
case class CC_E(a: T_B[T_B[CC_B, CC_A], T_A[CC_C]], b: Int, c: T_B[(CC_A,Boolean), T_B[CC_C, CC_A]]) extends T_B[Boolean, CC_A]

val v_a: T_B[Boolean, CC_A] = null
val v_b: Int = v_a match{
  case CC_C((CC_A(_),_), (_,CC_B()), _) => 0 
  case CC_D(_, _) => 1 
  case CC_E(_, 12, _) => 2 
  case CC_E(_, _, _) => 3 
}
}