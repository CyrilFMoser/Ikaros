package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D](a: D, b: (T_B[Char],T_B[Byte])) extends T_A[D, E]
case class CC_B[F, G]() extends T_A[G, F]
case class CC_C(a: T_A[CC_A[Int, (Byte,Boolean)], T_A[Int, Int]]) extends T_B[(CC_B[Int, Byte],CC_A[Byte, Boolean])]
case class CC_D(a: CC_A[CC_C, Boolean], b: T_B[Boolean]) extends T_B[(CC_B[Int, Byte],CC_A[Byte, Boolean])]
case class CC_E(a: T_A[Boolean, T_B[CC_C]], b: CC_A[CC_C, T_A[Int, CC_D]], c: CC_B[T_A[Byte, Byte], ((Byte,Int),CC_C)]) extends T_B[(CC_B[Int, Byte],CC_A[Byte, Boolean])]

val v_a: T_A[T_B[(CC_B[Int, Byte],CC_A[Byte, Boolean])], Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(_), (_,_)) => 0 
  case CC_A(CC_D(_, _), (_,_)) => 1 
  case CC_A(CC_E(_, CC_A(_, _), _), (_,_)) => 2 
  case CC_B() => 3 
}
}