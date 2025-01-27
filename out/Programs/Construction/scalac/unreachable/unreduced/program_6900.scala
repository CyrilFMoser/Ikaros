package Program_28 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Char, Char], T_A[Int, Boolean]], b: Boolean, c: T_A[T_A[Char, Byte], T_A[Char, Char]]) extends T_A[T_A[T_A[Int, Boolean], T_A[Byte, Byte]], T_A[T_A[Char, Boolean], T_A[Byte, (Char,Boolean)]]]
case class CC_B() extends T_A[T_A[T_A[Int, Boolean], T_A[Byte, Byte]], T_A[T_A[Char, Boolean], T_A[Byte, (Char,Boolean)]]]
case class CC_C(a: T_A[CC_B, CC_B], b: T_A[CC_B, ((Char,Boolean),CC_A)], c: T_A[CC_B, CC_A]) extends T_A[T_A[T_A[Int, Boolean], T_A[Byte, Byte]], T_A[T_A[Char, Boolean], T_A[Byte, (Char,Boolean)]]]

val v_a: T_A[T_A[T_A[Int, Boolean], T_A[Byte, Byte]], T_A[T_A[Char, Boolean], T_A[Byte, (Char,Boolean)]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C(_, _, _)