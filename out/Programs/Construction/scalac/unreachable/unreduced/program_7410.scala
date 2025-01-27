package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_B[C], b: T_A[C], c: Int) extends T_A[C]
case class CC_B() extends T_A[CC_A[T_A[Boolean]]]
case class CC_C(a: Char, b: CC_B) extends T_A[CC_A[T_A[Boolean]]]
case class CC_D(a: (((Byte,Boolean),(Int,Byte)),T_B[Boolean]), b: CC_A[T_A[CC_C]]) extends T_B[Boolean]
case class CC_E() extends T_B[Boolean]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_D(((_,_),CC_D(_, _)), CC_A(_, _, _)) => 0 
  case CC_D(((_,_),CC_E()), CC_A(_, _, _)) => 1 
  case CC_E() => 2 
}
}