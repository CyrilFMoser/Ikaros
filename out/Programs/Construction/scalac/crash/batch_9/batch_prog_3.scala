package Program_3 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Char, Char], (Boolean,Int)], b: (T_A[Int, Int],T_A[Byte, Boolean])) extends T_A[Char, T_A[T_A[Int, Byte], T_A[Int, Int]]]
case class CC_B[C](a: Byte, b: (CC_A,CC_A)) extends T_A[Char, T_A[T_A[Int, Byte], T_A[Int, Int]]]

val v_a: T_A[Char, T_A[T_A[Int, Byte], T_A[Int, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
}
}
// This is not matched: CC_B(_, _)