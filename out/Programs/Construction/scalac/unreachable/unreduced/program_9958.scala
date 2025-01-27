package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: (T_B,T_A[T_B, T_B]), b: (T_B,T_A[T_B, Byte])) extends T_A[T_A[T_B, T_A[T_B, Int]], Char]
case class CC_B(a: CC_A, b: Char, c: T_B) extends T_A[T_A[T_B, T_A[T_B, Int]], Char]
case class CC_C() extends T_A[T_A[T_B, T_A[T_B, Int]], Char]
case class CC_D(a: CC_B, b: T_B, c: T_B) extends T_B

val v_a: T_A[T_A[T_B, T_A[T_B, Int]], Char] = null
val v_b: Int = v_a match{
  case CC_A((CC_D(_, _, _),_), (CC_D(_, _, _),_)) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C() => 2 
}
}