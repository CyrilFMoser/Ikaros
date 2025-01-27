package Program_31 

package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: (Boolean,Byte), b: C, c: Byte) extends T_A[C]
case class CC_B[D](a: Char) extends T_A[D]
case class CC_C[E, F](a: (Int,Byte), b: CC_A[F]) extends T_A[E]
case class CC_D(a: T_A[Boolean]) extends T_B[((Int,Boolean),(Boolean,Boolean))]
case class CC_E[G](a: T_A[G], b: (Boolean,CC_D)) extends T_B[G]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_B('x') => 1 
  case CC_A((_,_), _, _) => 2 
  case CC_A((_,_), _, 0) => 3 
  case CC_C((12,0), CC_A(_, _, _)) => 4 
  case CC_C((_,0), CC_A(_, _, _)) => 5 
  case CC_C((_,_), CC_A(_, _, _)) => 6 
}
}
// This is not matched: (CC_C Boolean Boolean (Tuple Wildcard Byte) Wildcard (T_A Boolean))
// This is not matched: Pattern match is empty without constants