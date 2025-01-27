package Program_15 

package Program_3 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[Int, Char], (Char,Int)]

val v_a: T_A[T_A[Int, Char], (Char,Int)] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A Boolean (T_A (T_A Int Char) (Tuple Char Int)))
// This is not matched: Pattern match is empty without constants