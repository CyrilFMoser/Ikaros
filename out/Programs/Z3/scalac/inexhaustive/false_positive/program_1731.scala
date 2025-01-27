package Program_31 

package Program_11 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: ((Char,Int),(Char,Int)), b: (Boolean,Char), c: B) extends T_A[T_A[Boolean]]
case class CC_B() extends T_A[T_A[Boolean]]

val v_a: T_A[T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(_, (_,'x'), _) => 1 
  case CC_A(((_,_),(_,_)), _, _) => 2 
  case CC_A(((_,_),(_,_)), (_,'x'), _) => 3 
}
}
// This is not matched: (CC_A Boolean Wildcard Wildcard Wildcard (T_A (T_A Boolean)))
// This is not matched: (CC_B (CC_A Byte Wildcard Wildcard (T_A Byte))
//      Boolean
//      Wildcard
//      (T_A (CC_A Byte Boolean Boolean Boolean)))