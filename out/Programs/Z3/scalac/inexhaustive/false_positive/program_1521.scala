package Program_29 

package Program_1 

object Test {
sealed trait T_A
case class CC_A[A]() extends T_A
case class CC_B(a: ((Char,Int),(Int,Char)), b: CC_A[Byte], c: CC_A[T_A]) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, CC_A()) => 1 
  case CC_B(((_,_),(_,_)), CC_A(), CC_A()) => 2 
  case CC_B(_, CC_A(), _) => 3 
  case CC_B(((_,_),(_,_)), _, CC_A()) => 4 
}
}
// This is not matched: (CC_A T_A T_A)
// This is not matched: (CC_B Wildcard Wildcard Wildcard (T_A (T_A Int)))