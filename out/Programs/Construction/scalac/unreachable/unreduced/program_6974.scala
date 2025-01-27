package Program_9 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[Char, Char], b: T_A[T_A[Int, Char], T_A[Byte, Byte]], c: T_A[T_A[Int, Byte], T_A[Boolean, Byte]]) extends T_A[T_A[T_A[(Boolean,Boolean), Byte], Int], T_A[T_A[(Int,Char), Boolean], T_A[Boolean, Char]]]
case class CC_B(a: Int, b: CC_A, c: T_A[T_A[Boolean, (Boolean,Byte)], Int]) extends T_A[T_A[T_A[(Boolean,Boolean), Byte], Int], T_A[T_A[(Int,Char), Boolean], T_A[Boolean, Char]]]
case class CC_C() extends T_A[T_A[T_A[(Boolean,Boolean), Byte], Int], T_A[T_A[(Int,Char), Boolean], T_A[Boolean, Char]]]

val v_a: T_A[T_A[T_A[(Boolean,Boolean), Byte], Int], T_A[T_A[(Int,Char), Boolean], T_A[Boolean, Char]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_A(_, _, _)