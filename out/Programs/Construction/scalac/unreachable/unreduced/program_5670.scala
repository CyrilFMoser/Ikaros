package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[Char, D], b: T_A[D]) extends T_A[T_A[T_B[Char, (Byte,Char)]]]
case class CC_B(a: T_B[Byte, CC_A[Int]], b: T_B[T_B[(Char,Boolean), Boolean], CC_A[Int]], c: CC_A[CC_A[Char]]) extends T_A[T_A[T_B[Char, (Byte,Char)]]]
case class CC_C(a: (T_B[CC_B, CC_B],CC_B)) extends T_A[T_A[T_B[Char, (Byte,Char)]]]

val v_a: T_A[T_A[T_B[Char, (Byte,Char)]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, CC_A(_, _)) => 1 
}
}
// This is not matched: CC_C((_,CC_B(_, _, _)))