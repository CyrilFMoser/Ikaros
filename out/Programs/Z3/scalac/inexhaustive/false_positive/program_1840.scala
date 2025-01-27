package Program_31 

package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[C, C], C]
case class CC_B[D, E](a: Byte, b: (Byte,Boolean)) extends T_A[T_A[D, D], D]

val v_a: T_A[T_A[Int, Int], Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, (_,_)) => 1 
}
}
// This is not matched: (CC_B Int Boolean Wildcard Wildcard (T_A (T_A Int Int) Int))
// This is not matched: Pattern match is empty without constants