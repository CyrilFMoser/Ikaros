package Program_9 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[(T_A,T_A)], b: (T_B[Int],((Boolean,Byte),T_A))) extends T_A
case class CC_B(a: T_B[Byte], b: CC_A) extends T_B[Byte]
case class CC_C(a: (CC_B,Char)) extends T_B[Byte]
case class CC_D(a: CC_A) extends T_B[Byte]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_C((CC_B(_, _),_)) => 0 
  case CC_D(CC_A(_, (_,_))) => 1 
}
}
// This is not matched: CC_B(_, _)