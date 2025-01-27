package Program_16 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[Int, T_A[Byte, Int]], T_A[T_A[Int, Char], T_A[Byte, Char]]]
case class CC_B(a: CC_A, b: T_A[Boolean, T_A[Int, CC_A]], c: CC_A) extends T_A[T_A[Int, T_A[Byte, Int]], T_A[T_A[Int, Char], T_A[Byte, Char]]]
case class CC_C() extends T_A[T_A[Int, T_A[Byte, Int]], T_A[T_A[Int, Char], T_A[Byte, Char]]]

val v_a: T_A[T_A[Int, T_A[Byte, Int]], T_A[T_A[Int, Char], T_A[Byte, Char]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _, CC_A()) => 1 
  case CC_C() => 2 
}
}