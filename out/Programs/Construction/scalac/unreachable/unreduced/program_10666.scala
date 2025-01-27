package Program_14 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Boolean]) extends T_A[T_A[(Boolean,Char)]]
case class CC_B(a: Char, b: (T_A[CC_A],Char), c: T_A[(Boolean,CC_A)]) extends T_A[T_A[(Boolean,Char)]]
case class CC_C(a: Boolean, b: CC_B) extends T_A[T_A[(Boolean,Char)]]

val v_a: T_A[T_A[(Boolean,Char)]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_, _) => 2 
}
}