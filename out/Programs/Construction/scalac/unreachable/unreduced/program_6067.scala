package Program_4 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Char, Char], T_A[Char, Byte]]) extends T_A[T_A[T_A[Int, (Boolean,Byte)], T_A[Char, Int]], T_A[T_A[Byte, Byte], T_A[Char, Int]]]
case class CC_B(a: CC_A) extends T_A[T_A[T_A[Int, (Boolean,Byte)], T_A[Char, Int]], T_A[T_A[Byte, Byte], T_A[Char, Int]]]
case class CC_C() extends T_A[T_A[T_A[Int, (Boolean,Byte)], T_A[Char, Int]], T_A[T_A[Byte, Byte], T_A[Char, Int]]]

val v_a: T_A[T_A[T_A[Int, (Boolean,Byte)], T_A[Char, Int]], T_A[T_A[Byte, Byte], T_A[Char, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_)) => 1 
  case CC_C() => 2 
}
}