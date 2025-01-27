package Program_30 

package Program_9 

object Test {
sealed trait T_A[A]
case class CC_A[B, C]() extends T_A[B]
case class CC_B[D](a: CC_A[D, D]) extends T_A[CC_A[Char, Char]]
case class CC_C(a: CC_B[Char], b: T_A[Char]) extends T_A[CC_A[Char, Char]]

val v_a: T_A[CC_A[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
  case CC_B(CC_A()) => 2 
  case CC_C(CC_B(_), CC_A()) => 3 
  case CC_C(_, _) => 4 
}
}
// This is not matched: (CC_B (CC_A Boolean (CC_C Boolean Boolean Boolean) Boolean)
//      (CC_A (CC_A Boolean (CC_C Boolean Boolean (T_A Boolean)) Boolean)
//            (CC_A Boolean (CC_C Boolean Boolean (T_A (T_A Boolean))) Boolean)
//            (T_A (CC_A Boolean (CC_C Boolean Boolean (T_A Boolean)) Boolean)))
//      (T_A (CC_A Char Char (T_A Boolean))))
// This is not matched: Pattern match is empty without constants