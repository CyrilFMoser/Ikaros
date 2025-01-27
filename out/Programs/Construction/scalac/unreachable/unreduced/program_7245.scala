package Program_26 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[(Byte,Int)], b: Char) extends T_A[T_A[T_A[Char]]]
case class CC_B(a: Boolean) extends T_A[T_A[T_A[Char]]]
case class CC_C(a: Boolean, b: T_A[CC_A], c: CC_A) extends T_A[CC_A]

val v_a: T_A[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(true) => 1 
  case CC_B(false) => 2 
}
}