package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[T_A[C, C], C]) extends T_A[T_A[C, C], C]
case class CC_B() extends T_A[T_A[T_A[T_A[T_A[Char, Byte], T_A[Char, Byte]], T_A[Char, Byte]], T_A[T_A[T_A[Char, Byte], T_A[Char, Byte]], T_A[Char, Byte]]], T_A[T_A[T_A[Char, Byte], T_A[Char, Byte]], T_A[Char, Byte]]]

val v_a: T_A[T_A[T_A[T_A[T_A[Char, Byte], T_A[Char, Byte]], T_A[Char, Byte]], T_A[T_A[T_A[Char, Byte], T_A[Char, Byte]], T_A[Char, Byte]]], T_A[T_A[T_A[Char, Byte], T_A[Char, Byte]], T_A[Char, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
  case CC_B() => 1 
}
}