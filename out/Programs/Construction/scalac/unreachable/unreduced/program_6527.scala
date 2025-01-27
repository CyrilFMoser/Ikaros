package Program_20 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: Byte, b: T_A[T_A[Int, (Char,Boolean)], T_A[Byte, (Int,Boolean)]], c: T_A[(Char,Char), T_A[Boolean, Char]]) extends T_A[T_A[T_A[Char, Int], T_A[(Boolean,Char), Boolean]], T_A[T_A[Char, Boolean], T_A[Byte, Boolean]]]
case class CC_B(a: (T_A[CC_A, CC_A],CC_A)) extends T_A[T_A[T_A[Char, Int], T_A[(Boolean,Char), Boolean]], T_A[T_A[Char, Boolean], T_A[Byte, Boolean]]]
case class CC_C(a: Char) extends T_A[T_A[T_A[Char, Int], T_A[(Boolean,Char), Boolean]], T_A[T_A[Char, Boolean], T_A[Byte, Boolean]]]

val v_a: T_A[T_A[T_A[Char, Int], T_A[(Boolean,Char), Boolean]], T_A[T_A[Char, Boolean], T_A[Byte, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_B((_,CC_A(_, _, _))) => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_A(_, _, _)