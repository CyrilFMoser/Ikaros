package Program_24 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_B[T_A]], b: T_B[T_B[Byte]], c: T_A) extends T_A
case class CC_B() extends T_A
case class CC_C(a: T_B[Boolean], b: Int) extends T_B[T_A]
case class CC_D(a: CC_A, b: Int, c: (CC_A,((Boolean,Int),CC_B))) extends T_B[T_A]
case class CC_E(a: Char, b: Int, c: CC_D) extends T_B[T_A]

val v_a: T_B[T_A] = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_D(CC_A(_, _, _), _, (_,_)) => 1 
  case CC_E(_, _, _) => 2 
}
}