package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_A[T_B[(Int,Boolean)]]]
case class CC_B() extends T_A[T_A[T_B[(Int,Boolean)]]]
case class CC_C[C](a: C, b: T_B[T_B[C]], c: CC_B) extends T_B[C]
case class CC_D(a: T_B[T_A[(Byte,Int)]]) extends T_B[CC_B]
case class CC_E(a: Byte, b: T_B[(Int,Byte)], c: (T_B[CC_B],T_B[CC_D])) extends T_B[CC_B]

val v_a: T_B[CC_B] = null
val v_b: Int = v_a match{
  case CC_D(CC_C(_, CC_C(_, _, _), CC_B())) => 0 
  case CC_E(_, CC_C((_,_), _, _), (CC_C(_, _, _),CC_C(_, _, _))) => 1 
  case CC_E(_, CC_C((_,_), _, _), (CC_D(_),CC_C(_, _, _))) => 2 
  case CC_E(_, CC_C((_,_), _, _), (CC_E(_, _, _),CC_C(_, _, _))) => 3 
}
}
// This is not matched: CC_C(_, CC_C(_, _, _), _)