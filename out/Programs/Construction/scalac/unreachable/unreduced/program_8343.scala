package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_B[C], b: (T_A[Int],(Boolean,Int))) extends T_A[C]
case class CC_B(a: T_A[Byte]) extends T_A[Byte]
case class CC_C() extends T_B[CC_B]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, (CC_A(_, _),(_,_))) => 0 
  case CC_B(CC_A(_, (_,_))) => 1 
  case CC_B(CC_B(CC_A(_, _))) => 2 
  case CC_B(CC_B(CC_B(_))) => 3 
}
}