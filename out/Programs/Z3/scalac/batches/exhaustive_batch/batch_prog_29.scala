package Program_29 

 object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, CC_A(_, _)), CC_A(_, _)) => 0 
  case CC_A(_, CC_A(CC_A(_, _), CC_A(_, _))) => 1 
  case CC_A(CC_A(_, _), CC_A(_, _)) => 2 
}
}