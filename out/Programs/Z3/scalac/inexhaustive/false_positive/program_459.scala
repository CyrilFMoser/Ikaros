package Program_31 

package Program_8 

object Test {
sealed trait T_A[A]
case class CC_A[B]() extends T_A[T_A[Char]]

val v_a: T_A[T_A[Char]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A Boolean (T_A (T_A Char)))
// This is not matched: Pattern match is empty without constants