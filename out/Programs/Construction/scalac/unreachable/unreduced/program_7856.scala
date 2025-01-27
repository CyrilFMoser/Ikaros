package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, Boolean]
case class CC_B[F](a: T_A[F, F], b: Boolean) extends T_A[F, Boolean]
case class CC_C(a: (CC_A[Byte],(Boolean,Byte)), b: T_A[T_A[Int, Boolean], T_B[Boolean, Int]]) extends T_B[T_A[T_A[Int, (Boolean,Char)], Boolean], T_B[(Char,Boolean), T_A[Boolean, Char]]]
case class CC_D(a: T_A[CC_A[Boolean], CC_A[CC_C]]) extends T_B[T_A[T_A[Int, (Boolean,Char)], Boolean], T_B[(Char,Boolean), T_A[Boolean, Char]]]
case class CC_E(a: T_A[T_A[CC_D, Boolean], Boolean]) extends T_B[T_A[T_A[Int, (Boolean,Char)], Boolean], T_B[(Char,Boolean), T_A[Boolean, Char]]]

val v_a: T_B[T_A[T_A[Int, (Boolean,Char)], Boolean], T_B[(Char,Boolean), T_A[Boolean, Char]]] = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_D(_) => 1 
  case CC_E(CC_A()) => 2 
  case CC_E(CC_B(_, _)) => 3 
}
}