package Program_6 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Int, Boolean],Char), b: T_A[C, C]) extends T_A[T_A[T_A[Int, (Byte,Char)], T_A[Char, Char]], C]
case class CC_B(a: T_A[CC_A[Int], CC_A[Char]]) extends T_A[T_A[T_A[Int, (Byte,Char)], T_A[Char, Char]], T_A[T_A[Int, Boolean], CC_A[Char]]]
case class CC_C() extends T_A[T_A[T_A[Int, (Byte,Char)], T_A[Char, Char]], T_A[T_A[Int, Boolean], CC_A[Char]]]

val v_a: T_A[T_A[T_A[Int, (Byte,Char)], T_A[Char, Char]], T_A[T_A[Int, Boolean], CC_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B(_)