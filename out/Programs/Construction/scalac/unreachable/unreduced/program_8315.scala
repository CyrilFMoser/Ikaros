package Program_5 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_A, b: T_B[T_B[T_A, T_A], CC_A]) extends T_A
case class CC_C[C]() extends T_B[CC_A, C]
case class CC_D[D](a: T_A, b: (CC_C[Byte],CC_B), c: T_A) extends T_B[CC_A, Boolean]
case class CC_E(a: CC_C[(CC_B,(Byte,Boolean))], b: T_B[T_B[CC_A, T_A], CC_D[Boolean]]) extends T_B[CC_A, Boolean]

val v_a: T_B[CC_A, Boolean] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(CC_A(), (CC_C(),CC_B(_, _)), CC_A()) => 1 
  case CC_D(CC_B(CC_A(), _), (CC_C(),CC_B(_, _)), CC_A()) => 2 
  case CC_D(CC_B(CC_B(_, _), _), (CC_C(),CC_B(_, _)), CC_A()) => 3 
  case CC_D(CC_A(), (CC_C(),CC_B(_, _)), CC_B(CC_A(), _)) => 4 
  case CC_D(CC_B(CC_A(), _), (CC_C(),CC_B(_, _)), CC_B(CC_A(), _)) => 5 
  case CC_D(CC_B(CC_B(_, _), _), (CC_C(),CC_B(_, _)), CC_B(CC_A(), _)) => 6 
  case CC_D(CC_A(), (CC_C(),CC_B(_, _)), CC_B(CC_B(_, _), _)) => 7 
  case CC_D(CC_B(CC_A(), _), (CC_C(),CC_B(_, _)), CC_B(CC_B(_, _), _)) => 8 
  case CC_D(CC_B(CC_B(_, _), _), (CC_C(),CC_B(_, _)), CC_B(CC_B(_, _), _)) => 9 
  case CC_E(CC_C(), _) => 10 
}
}