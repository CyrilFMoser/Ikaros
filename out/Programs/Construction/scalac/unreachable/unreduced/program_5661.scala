package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_B[T_A, T_B[(Boolean,Boolean), CC_A]], b: CC_A, c: CC_A) extends T_A
case class CC_C[C](a: T_B[CC_B, C], b: T_A) extends T_B[CC_B, C]
case class CC_D[D](a: (T_B[CC_B, CC_A],CC_B)) extends T_B[CC_B, D]

val v_a: T_B[CC_B, Boolean] = null
val v_b: Int = v_a match{
  case CC_C(CC_C(_, _), CC_A()) => 0 
  case CC_C(CC_C(_, _), CC_B(_, CC_A(), CC_A())) => 1 
  case CC_C(CC_D((_,_)), CC_A()) => 2 
  case CC_C(CC_D((_,_)), CC_B(_, CC_A(), CC_A())) => 3 
  case CC_D((CC_C(_, _),CC_B(_, _, _))) => 4 
  case CC_D((CC_D(_),CC_B(_, _, _))) => 5 
}
}