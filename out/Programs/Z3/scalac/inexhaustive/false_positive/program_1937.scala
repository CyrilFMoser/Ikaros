package Program_31 

package Program_14 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[T_A[Char]]
case class CC_B() extends T_A[T_A[Char]]
case class CC_C[B](a: CC_A) extends T_A[T_A[Char]]

val v_a: T_A[T_A[Char]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B() => 1 
  case CC_C(_) => 2 
  case CC_C(CC_A()) => 3 
}
}
// This is not matched: (CC_C Boolean Wildcard (T_A (T_A Char)))
// This is not matched: (CC_A Char Wildcard (T_A Char))