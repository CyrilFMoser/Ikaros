package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D](a: Int, b: T_B[E]) extends T_A[E, D]
case class CC_B(a: T_A[T_A[Char, Char], T_A[Char, Int]], b: T_A[T_A[Boolean, Int], (Boolean,Boolean)]) extends T_B[T_A[T_B[Char], T_A[Byte, Boolean]]]
case class CC_C() extends T_B[T_A[T_B[Char], T_A[Byte, Boolean]]]
case class CC_D(a: CC_B, b: T_A[(CC_B,CC_B), CC_B], c: (Char,CC_A[CC_C, CC_C])) extends T_B[T_A[T_B[Char], T_A[Byte, Boolean]]]

val v_a: T_B[T_A[T_B[Char], T_A[Byte, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _), CC_A(_, _)) => 0 
  case CC_D(CC_B(_, _), _, (_,_)) => 1 
}
}
// This is not matched: CC_C()