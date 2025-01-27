package Program_27 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Char, b: (T_A,(T_A,(Int,Byte))), c: (T_B[T_A],(T_A,T_A))) extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C(a: CC_B) extends T_B[CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, (_,_), (_,_))) => 0 
  case CC_B(CC_B(CC_A(_, _, _))) => 1 
  case CC_B(CC_B(CC_B(_))) => 2 
}
}
// This is not matched: CC_A(_, _, _)