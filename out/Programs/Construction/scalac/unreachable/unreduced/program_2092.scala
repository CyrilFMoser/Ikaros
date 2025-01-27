package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[Boolean]
case class CC_B(a: T_A[Int]) extends T_A[Boolean]
case class CC_C(a: T_B[T_A[Boolean]], b: (CC_B,((Byte,Char),CC_B))) extends T_A[Boolean]
case class CC_D[D, E](a: T_A[Boolean]) extends T_B[D]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
  case CC_C(_, (CC_B(_),(_,_))) => 2 
}
}