package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D]) extends T_A[D, T_B[T_A[Int, Char]]]
case class CC_B() extends T_A[(CC_A[Byte],CC_A[Boolean]), T_B[T_A[Int, Char]]]
case class CC_C[E](a: Int, b: E, c: T_B[T_B[T_A[CC_B, Byte]]]) extends T_B[E]
case class CC_D[G](a: CC_A[G], b: T_B[G], c: G) extends T_B[G]
case class CC_E(a: Int, b: CC_D[CC_A[CC_B]]) extends T_B[(Char,T_B[CC_B])]

val v_a: T_B[(Char,T_B[CC_B])] = null
val v_b: Int = v_a match{
  case CC_C(_, ('x',CC_C(_, _, _)), CC_C(_, _, _)) => 0 
  case CC_C(_, ('x',CC_C(_, _, _)), CC_D(CC_A(_), _, CC_C(_, _, _))) => 1 
  case CC_C(_, ('x',CC_C(_, _, _)), CC_D(CC_A(_), _, CC_D(_, _, _))) => 2 
  case CC_C(_, ('x',CC_D(_, _, _)), CC_C(_, _, _)) => 3 
  case CC_C(_, ('x',CC_D(_, _, _)), CC_D(CC_A(_), _, CC_C(_, _, _))) => 4 
  case CC_C(_, ('x',CC_D(_, _, _)), CC_D(CC_A(_), _, CC_D(_, _, _))) => 5 
  case CC_C(_, (_,CC_C(_, _, _)), CC_C(_, _, _)) => 6 
  case CC_C(_, (_,CC_C(_, _, _)), CC_D(CC_A(_), _, CC_C(_, _, _))) => 7 
  case CC_C(_, (_,CC_C(_, _, _)), CC_D(CC_A(_), _, CC_D(_, _, _))) => 8 
  case CC_C(_, (_,CC_D(_, _, _)), CC_C(_, _, _)) => 9 
  case CC_C(_, (_,CC_D(_, _, _)), CC_D(CC_A(_), _, CC_C(_, _, _))) => 10 
  case CC_C(_, (_,CC_D(_, _, _)), CC_D(CC_A(_), _, CC_D(_, _, _))) => 11 
  case CC_D(CC_A(_), CC_C(_, (_,_), _), _) => 12 
  case CC_D(CC_A(_), CC_D(CC_A(_), CC_C(_, _, _), (_,_)), _) => 13 
  case CC_D(CC_A(_), CC_D(CC_A(_), CC_D(_, _, _), (_,_)), _) => 14 
  case CC_D(CC_A(_), CC_D(CC_A(_), CC_E(_, _), (_,_)), _) => 15 
  case CC_D(CC_A(_), CC_E(_, _), _) => 16 
  case CC_E(_, _) => 17 
}
}