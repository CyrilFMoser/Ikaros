package Program_8 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[(Byte,Char)]]) extends T_A[T_A[T_A[Int]]]
case class CC_B(a: CC_A) extends T_A[T_A[T_A[Int]]]
case class CC_C(a: (CC_B,Boolean)) extends T_A[T_A[T_A[Int]]]

val v_a: T_A[T_A[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_B(CC_A(_))