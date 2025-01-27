package Program_4 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: (Byte,T_B[Byte]), c: T_A) extends T_A
case class CC_B() extends T_A
case class CC_C() extends T_A
case class CC_D(a: CC_C, b: Byte, c: CC_C) extends T_B[T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_), _) => 0 
  case CC_B() => 1 
  case CC_C() => 2 
}
}