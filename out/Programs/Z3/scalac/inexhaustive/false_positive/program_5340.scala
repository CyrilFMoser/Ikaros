package Program_15 

package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: C, b: (Byte,Byte)) extends T_A[C]
case class CC_B[D, E]() extends T_A[D]
case class CC_C[F](a: CC_B[F, Byte], b: Boolean, c: (Int,(Int,Boolean))) extends T_A[F]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(_, _) => 1 
  case CC_A(0, _) => 2 
  case CC_A(_, (_,_)) => 3 
  case CC_A(0, (_,_)) => 4 
  case CC_A(0, (0,0)) => 5 
  case CC_A(0, (0,_)) => 6 
  case CC_A(_, (0,_)) => 7 
  case CC_A(0, (_,0)) => 8 
  case CC_C(_, _, _) => 9 
}
}
// This is not matched: (CC_B Byte Boolean (T_A Byte))
// This is not matched: (CC_B Wildcard (T_A (T_A Int)))