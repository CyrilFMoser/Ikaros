package Program_3 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_A, c: ((T_A,Boolean),T_A)) extends T_A
case class CC_B(a: CC_A) extends T_B[(T_B[T_A],T_A)]
case class CC_C(a: T_B[CC_A], b: CC_A) extends T_B[(T_B[T_A],T_A)]
case class CC_D(a: CC_B, b: CC_B) extends T_B[(T_B[T_A],T_A)]

val v_a: T_B[(T_B[T_A],T_A)] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(CC_A(_, _, _), CC_A(_, _, _), (_,_))) => 0 
  case CC_C(_, CC_A(CC_A(_, _, _), CC_A(_, _, _), (_,_))) => 1 
  case CC_D(_, _) => 2 
}
}