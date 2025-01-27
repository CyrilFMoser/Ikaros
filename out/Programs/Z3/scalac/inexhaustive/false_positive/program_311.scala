package Program_31 

package Program_15 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Char], b: (Byte,(Char,Boolean))) extends T_A[T_A[Byte]]
case class CC_B[B](a: CC_A) extends T_A[T_A[Byte]]

val v_a: T_A[T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,(_,_))) => 0 
  case CC_B(CC_A(_, _)) => 1 
}
}
// This is not matched: (CC_B Boolean (CC_A Wildcard Wildcard (T_A (T_A Byte))) (T_A (T_A Byte)))
// This is not matched: (CC_B Boolean (CC_A Wildcard Wildcard (T_A (T_A Byte))) (T_A (T_A Byte)))