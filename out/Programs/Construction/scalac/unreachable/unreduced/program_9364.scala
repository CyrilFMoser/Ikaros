package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_B[T_A[Int], T_A[Char]]]
case class CC_B(a: ((CC_A,CC_A),Char), b: T_A[T_A[CC_A]]) extends T_A[T_B[T_A[Int], T_A[Char]]]
case class CC_C(a: Byte, b: T_B[T_A[CC_B], Byte], c: Int) extends T_A[T_B[T_A[Int], T_A[Char]]]

val v_a: T_A[T_B[T_A[Int], T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(((_,_),_), _) => 1 
  case CC_C(0, _, _) => 2 
}
}
// This is not matched: CC_C(_, _, _)