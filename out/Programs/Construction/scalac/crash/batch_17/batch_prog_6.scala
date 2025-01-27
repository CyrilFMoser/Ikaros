package Program_6 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: Boolean, b: (Boolean,CC_A), c: CC_A) extends T_A
case class CC_C[B](a: CC_B) extends T_B[B]
case class CC_D[C](a: T_B[T_B[C]], b: (T_B[(Byte,Char)],T_A)) extends T_B[C]
case class CC_E[D](a: CC_A) extends T_B[D]

val v_a: T_B[CC_B] = null
val v_b: Int = v_a match{
  case CC_D(CC_C(CC_B(_, _, _)), _) => 0 
  case CC_D(CC_D(CC_C(_), (_,_)), _) => 1 
  case CC_D(CC_D(CC_D(_, _), (_,_)), _) => 2 
  case CC_D(CC_D(CC_E(_), (_,_)), _) => 3 
  case CC_D(CC_E(_), _) => 4 
  case CC_E(CC_A()) => 5 
}
}
// This is not matched: CC_C(CC_B(_, _, CC_A()))