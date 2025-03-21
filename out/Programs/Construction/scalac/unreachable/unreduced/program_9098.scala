package Program_2 

object Test {
sealed trait T_A[A]
case class CC_A(a: (Boolean,T_A[Char])) extends T_A[T_A[Byte]]
case class CC_B(a: Boolean, b: T_A[CC_A]) extends T_A[T_A[Byte]]
case class CC_C(a: CC_B, b: Byte) extends T_A[T_A[Byte]]

val v_a: T_A[T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, 0) => 2 
  case CC_C(_, _) => 3 
}
}