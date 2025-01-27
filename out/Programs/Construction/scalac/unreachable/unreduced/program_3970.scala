package Program_24 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: Int) extends T_A[T_A[Int, T_A[Byte, Int]], T_A[T_A[Char, Byte], T_A[Boolean, Char]]]
case class CC_B(a: (T_A[(Boolean,Boolean), CC_A],CC_A)) extends T_A[T_A[Int, T_A[Byte, Int]], T_A[T_A[Char, Byte], T_A[Boolean, Char]]]
case class CC_C(a: Byte) extends T_A[T_A[Int, T_A[Byte, Int]], T_A[T_A[Char, Byte], T_A[Boolean, Char]]]

val v_a: T_A[T_A[Int, T_A[Byte, Int]], T_A[T_A[Char, Byte], T_A[Boolean, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B((_,CC_A(_))) => 1 
  case CC_C(_) => 2 
}
}