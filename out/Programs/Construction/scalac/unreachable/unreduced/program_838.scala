package Program_26 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[(Int,Byte)]]) extends T_A[T_A[T_A[Char]]]
case class CC_B(a: Boolean, b: T_A[CC_A]) extends T_A[CC_A]
case class CC_C(a: Byte, b: CC_B) extends T_A[T_A[T_A[Char]]]

val v_a: T_A[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C(_, _) => 1 
}
}