package Program_8 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_B[Byte]], b: Int, c: Char) extends T_A
case class CC_B(a: T_A, b: Char) extends T_A
case class CC_C(a: (((Boolean,Byte),Byte),CC_B)) extends T_B[CC_B]
case class CC_D(a: CC_B) extends T_B[CC_B]

val v_a: T_B[CC_B] = null
val v_b: Int = v_a match{
  case CC_D(CC_B(CC_A(_, _, _), _)) => 0 
  case CC_D(CC_B(CC_B(_, _), _)) => 1 
}
}
// This is not matched: CC_C(_)