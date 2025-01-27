package Program_14 

package Program_2 

object Test {
sealed trait T_A[A]
case class CC_A(a: (Boolean,Int), b: Int) extends T_A[Char]
case class CC_B[B]() extends T_A[Char]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(_, 12) => 1 
  case CC_A((_,_), _) => 2 
  case CC_A((_,12), 12) => 3 
}
}
// This is not matched: (CC_B Boolean (T_A Char))
// This is not matched: (CC_B (CC_A T_A) T_A)