package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[C, C]]
case class CC_B(a: T_A[T_A[Byte, Byte], T_A[T_A[Byte, Byte], T_A[Byte, Byte]]], b: T_A[T_A[Char, Int], Int]) extends T_A[T_A[T_A[Boolean, Char], T_A[T_A[Boolean, Char], T_A[Boolean, Char]]], T_A[T_A[T_A[Boolean, Char], T_A[T_A[Boolean, Char], T_A[Boolean, Char]]], T_A[T_A[Boolean, Char], T_A[T_A[Boolean, Char], T_A[Boolean, Char]]]]]

val v_a: T_A[T_A[T_A[Boolean, Char], T_A[T_A[Boolean, Char], T_A[Boolean, Char]]], T_A[T_A[T_A[Boolean, Char], T_A[T_A[Boolean, Char], T_A[Boolean, Char]]], T_A[T_A[Boolean, Char], T_A[T_A[Boolean, Char], T_A[Boolean, Char]]]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _) => 1 
}
}