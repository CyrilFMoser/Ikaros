package Program_31 

package Program_3 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[Boolean, Int], C]
case class CC_B[E, D, F](a: (Byte,Char)) extends T_A[D, E]
case class CC_C() extends T_A[T_A[Byte, Int], T_A[Byte, Int]]

val v_a: T_A[T_A[Byte, Int], T_A[Byte, Int]] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_B((_,_)) => 1 
  case CC_B((0,'x')) => 2 
  case CC_B((_,'x')) => 3 
}
}
// This is not matched: (CC_B (T_A Byte Int)
//      (T_A Byte Int)
//      Boolean
//      Wildcard
//      (T_A (T_A Byte Int) (T_A Byte Int)))
// This is not matched: (CC_B T_A)