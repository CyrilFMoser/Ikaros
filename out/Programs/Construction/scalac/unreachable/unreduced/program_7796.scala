package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[T_A[(T_B,Int)]]
case class CC_B[B](a: B, b: B, c: B) extends T_A[T_A[(T_B,Int)]]
case class CC_C() extends T_A[Char]
case class CC_D(a: CC_B[((Boolean,Int),CC_C)]) extends T_B
case class CC_E(a: CC_C, b: CC_A, c: (Int,T_A[(Int,Boolean)])) extends T_B
case class CC_F(a: T_A[Char], b: (CC_A,CC_D), c: CC_C) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(CC_B((_,_), (_,_), (_,_))) => 0 
  case CC_E(_, CC_A(), (_,_)) => 1 
  case CC_F(CC_C(), _, _) => 2 
}
}