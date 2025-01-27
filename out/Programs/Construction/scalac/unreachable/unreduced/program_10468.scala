package Program_16 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[T_A[Boolean, Int], Byte], T_A[T_A[Char, Byte], T_A[Int, Int]]]
case class CC_B(a: (Int,CC_A), b: (T_A[CC_A, CC_A],CC_A)) extends T_A[T_A[T_A[Boolean, Int], Byte], T_A[T_A[Char, Byte], T_A[Int, Int]]]

val v_a: T_A[T_A[T_A[Boolean, Int], Byte], T_A[T_A[Char, Byte], T_A[Int, Int]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((_,CC_A()), (_,CC_A())) => 1 
}
}